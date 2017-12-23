package generics;

public class Hierarchy {
}

class BaseParent {
    @Override
    public String toString() {
	return "Base Parent[]";
    }
    
    public String thisHierarchy(){
	return "this hierarchy:Base Parent[]";
    }
}

class BaseChild1 extends BaseParent {
}

class BaseChild2 extends BaseParent {
}