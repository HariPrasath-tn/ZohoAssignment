class Temp1{
    Temp1(){
        System.out.println(" In Temp1");
    }

}

final class FirstClass extends ClassTest {
    private String name;
    private String _class;

    FirstClass(String name, String _class){
        System.out.println("In Main class ");
        this.name = name;
        this._class = _class;
    }

    public String getName(){
        return name;
    }

    public String get_class(){
        return _class;
    }

    public static void main (String [] args){
        FirstClass firstClass = new FirstClass("test1", "12");
    }

}
