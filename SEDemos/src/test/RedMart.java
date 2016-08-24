package test;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.atomic.AtomicInteger;

public class RedMart {
	int array[][];
	static ForkJoinPool mainPool;
	static ConcurrentHashMap<Integer, MyPath> mapOFPaths = null;
	static final int[][] INPUT;
	static final int LENGTH;
	static final int WIDTH;
	static AtomicInteger MAXCOUNT;

	static {
		mapOFPaths = new ConcurrentHashMap<>();
		mainPool = new ForkJoinPool(10);
		MAXCOUNT = new AtomicInteger(0);
		
		DataReader.readArray();
		INPUT = DataReader.getArray();
		LENGTH = DataReader.getLength();
		WIDTH = DataReader.getBreadth();
	}

	/*
	 * static final int[][] INPUT = { {1, 2, 9, 7, 8}, {3, 7, 9, 4, 5}, {6, 1,
	 * 6, 5, 3}, {8, 6, 0, 1, 6}, {5, 4, 3, 1, 9} };
	 */

	/*
	 * static final int[][] INPUT = { {1, 2, 4}, {3, 7, 9}, {5, 6, 8} };
	 */

	public RedMart() {}
	
	// ConcurrentHashMapMain
	public static void main(String args[]) {
		try {
			System.setOut(new PrintStream("output.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for (int x = 0; x < LENGTH; x++) {
			for (int y = 0; y < WIDTH; y++) {
				System.out.format("\nCurrent Element [%d][%d].", x+1, y+1);
				backTrackLongest(x, y);
			}
		}
		System.out.println("\n");
		System.out.println(mapOFPaths);
	}
	
	/*public static MyPath subMain(int x){
		MyPath result = null;
		TreeSet<MyPath> setOfPaths = new TreeSet<>();
		for (int yCounter = 0; yCounter < WIDTH; yCounter++) {
			System.out.format("\nCurrent Element [%d][%d].", x+1, yCounter+1);
			backTrackLongest(x, yCounter);
		}
		result = setOfPaths.descendingIterator().next();
		return result;
	}*/
	
	public static void backTrackLongest(int x, int y) {
		mainPool = new ForkJoinPool(20);
		RedMart outer = new RedMart();
		MyPath myPath = outer.new MyPath(x, y);
		MyPath result = null;
		try {
			mainPool.invoke(myPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	class MyPathSizeComparator implements Comparator<MyPath>{

		@Override
		public int compare(MyPath o1, MyPath o2) {
			return o1.getSteps() - o2.getSteps();
		}
	}
	
	class MyPathSlopeComparator implements Comparator<MyPath>{

		@Override
		public int compare(MyPath o1, MyPath o2) {
			return o1.getSlope() - o2.getSlope();
		}
		
	}

	class MyPath extends RecursiveAction implements Comparable<MyPath> {
		
		private int beginX, beginY, currElmValue;
		private List<Integer> xAxis;
		private List<Integer> yAxis;

		public MyPath() {
			xAxis = new LinkedList<>();
			yAxis = new LinkedList<>();
			// System.out.println("New Path Starts !! " +
			// Thread.currentThread().getName());
		}

		public MyPath(int beginX, int beginY) {
			this.beginX = beginX;
			this.beginY = beginY;
			this.currElmValue = INPUT[beginX][beginY];
			xAxis = new LinkedList<>();
			yAxis = new LinkedList<>();
			// System.out.println("New Path Starts !! " +
			// Thread.currentThread().getName());
			addStep(beginX, beginY);
			// printPath();
		}

		public MyPath(int beginX, int beginY, final List<Integer> xAxis, final List<Integer> yAxis) {
			this.beginX = beginX;
			this.beginY = beginY;
			this.currElmValue = INPUT[beginX][beginY];
			this.xAxis = new LinkedList<>(xAxis);
			this.yAxis = new LinkedList<>(yAxis);
			// System.out.println("New Path Starts !! " +
			// Thread.currentThread().getName());
			addStep(beginX, beginY);
			// printPath();
		}

		@Override
		public int compareTo(MyPath o) {
			// return this.getDifference() - o.getDifference();
			return this.xAxis.size() - o.xAxis.size();
		}

		/*
		 * public int getDifference(){ return
		 * INPUT[xAxis.get(xAxis.size())][yAxis.get(xAxis.size())]-
		 * INPUT[xAxis.get(0)][yAxis.get(0)]; }
		 */

		public void addStep(int x, int y) {
			xAxis.add(x);
			yAxis.add(y);
		}

		@Override
		protected void compute() {
			List<RecursiveAction> actions = new LinkedList<>();
			int topElement = 0, downElement = 0, leftElement = 0, rightElement = 0;
			// if no element at top
			if (beginX == 0)
				// exit topElement = -1
				topElement = -1;
			// else if top has an element of higher value
			else if (INPUT[beginX - 1][beginY] > currElmValue) {
				// System.out.println("Top Element:" + INPUT[beginX-1][beginY]);
				// spawn new thread - copy pathStack, new X-coord, new y-Coord
				actions.add(new MyPath(beginX - 1, beginY, getxAxis(), getyAxis()));
			} else // else topElement is not greater
				topElement = -1;

			// if no element at bottom
			if (beginX == LENGTH - 1)
				downElement = -1;
			// else if down has an element higher value
			else if (INPUT[beginX + 1][beginY] > currElmValue) {
				// System.out.println("Down Element:" +
				// INPUT[beginX+1][beginY]);
				// spawn new thread - copy pathStack, new X-coord, new y-Coord
				actions.add(new MyPath(beginX + 1, beginY, getxAxis(), getyAxis()));
			}
			// else downElement = -1
			else
				downElement = -1;

			// if no element to the left
			if (beginY == 0)
				leftElement = -1;
			// else if left has an element of higher value
			else if (INPUT[beginX][beginY - 1] > currElmValue) {
				// System.out.println("Left Element:" +
				// INPUT[beginX][beginY-1]);
				// spawn new thread - copy pathStack, new X-coord, new y-Coord
				// System.out.println("Forking new Thread");
				actions.add(new MyPath(beginX, beginY - 1, getxAxis(), getyAxis()));
			}
			// else leftElement = -1
			else
				leftElement = -1;

			// if no element to the right
			if (beginY == WIDTH - 1)
				rightElement = -1;
			// else if right has an element higher value
			else if (INPUT[beginX][beginY + 1] > currElmValue) {
				// System.out.println("Right Element:" +
				// INPUT[beginX][beginY+1]);
				// spawn new thread - copy pathStack, new X-coord, new y-Coord
				actions.add(new MyPath(beginX, beginY + 1, getxAxis(), getyAxis()));
			}
			// else rightElement = -1
			else
				rightElement = -1;

			// print PathTrace and Exit
			if (topElement + downElement + leftElement + rightElement == -4) {
				// System.out.println("This path has ended !!!" +
				// Thread.currentThread().getName());
				// printPath();
				if(this.getSteps() > MAXCOUNT.get()){
					MAXCOUNT.set(this.getSteps());
					mapOFPaths.put(this.getSteps(), this);
				} else if(mapOFPaths.containsKey(this.getSteps()) && (mapOFPaths.get(this.getSteps())).getSlope()<this.getSlope()){
					mapOFPaths.put(this.getSteps(), this);
				}
			}
			invokeAll(actions);
		}

		public void printPath() {
			/*
			 * System.out.println("X-axis points Length:" + getxAxis().size());
			 * System.out.println("Y-axis points Length:" + getyAxis().size());
			 */

			int listIndex = 0;
			System.out.format("\n----------------Longest Path----------------\nTotal Steps:%d\n", getxAxis().size());
			while (listIndex < getxAxis().size()) {
				System.out.format("[%d] at [%d, %d]\n", INPUT[getxAxis().get(listIndex)][getyAxis().get(listIndex)],
						getxAxis().get(listIndex)+1, getyAxis().get(listIndex)+1);
				listIndex++;
			}

			/*
			 * System.out.println("X-Axis:" + getxAxis());
			 * System.out.println("Y-Axis:" + getyAxis());
			 */
		}

		public List<Integer> getxAxis() {
			return xAxis;
		}

		public List<Integer> getyAxis() {
			return yAxis;
		}
		
		public int getSteps(){
			return xAxis.size();
		}
		
		public int getSlope(){
			int firstX = xAxis.get(0);
			int firstY = yAxis.get(0);
			int lastX = xAxis.get(xAxis.size()-1);
			int lastY = yAxis.get(yAxis.size()-1);
			return INPUT[lastX][lastY] - INPUT[firstX][firstY];
		}

		@Override
		public String toString() {
			StringBuffer buffer = new StringBuffer();
			int listIndex = 0;
			buffer.append(String.format("\n----------------Path----------------\nTotal Steps:%d\n", getxAxis().size()));
			while (listIndex < getxAxis().size()) {
				buffer.append(String.format("[%d] at [%d, %d]\n", INPUT[getxAxis().get(listIndex)][getyAxis().get(listIndex)],
						getxAxis().get(listIndex)+1, getyAxis().get(listIndex)+1));
				listIndex++;
			}
			return buffer.toString();
		}

	}

}
