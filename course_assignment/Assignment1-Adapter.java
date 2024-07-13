//CoffeeMachineInterface.java

public interface CoffeeMachineInterface {

    public void chooseFirstSelection();
    public void chooseSecondSelection();

}


//OldCoffeeMachine.java

public class OldCoffeeMachine {

    public void selectA(){
        System.out.println("select A");
    };
    public void selectB(){
        System.out.println("select B");
    };

}





//CoffeeTouchscreenAdapter.java

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private OldCoffeeMachine OldVendingMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine OldVendingMachine){
        this.OldVendingMachine = OldVendingMachine;
    }
    
    @Override
    public chooseFirstSelection(){
        OldVendingMachine.selectA();
    }

    @Override
    public chooseSecondSelection(){
        OldVendingMachine.selectB();
    }

}



////答案：

//CoffeeMachineInterface.java

public interface CoffeeMachineInterface {
	public void chooseFirstSelection();
	public void chooseSecondSelection();
}


//OldCoffeeMachine.java

public class OldCoffeeMachine {

	public void selectA() {
		System.out.println("A - Selected");
	}
	public void selectB() {
		System.out.println("B - Selected");
	}
}






//CoffeeTouchscreenAdapter.java

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

	OldCofffeeMachine theMachine;

	public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
		theMachine = newMachine;
	}
	
	public void chooseFirstSelection() {
		theMachine.selectA();
	}
	
	public void chooseSecondSelection() {
		theMachine.selectB();
}
}