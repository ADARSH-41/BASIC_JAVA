class TDP{
    String party = "TDP";
    void rule()
    {
        System.out.println("This is "+party+"'s rule");
    }
}

class YSR extends TDP{
    String party = "YSR";
    void rule()
    {
        System.out.println("This is "+party+"'s rule");
    }

    public void formGOVT(){
        System.out.println("When called without Super Keyword...");
        rule();
        System.out.println("When called with Super Keyword...");
        super.rule();
    }
}


public class SuperTest{
    public static void main(String[] args) {
        YSR gov = new YSR();
        gov.formGOVT();
    }
}