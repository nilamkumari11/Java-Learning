package enumExample;

public class Basic{
    enum Week  implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // those are enum constants
        // public, static and final
        // since it is final we can not create child enum
        // type is Week

        Week() {
            System.out.println("COnstructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("hey interface A");
        }
        // this is not public or protected, only private or default
        // because if public or protected it will allow initialisation of more than one objects
        // we don't want to create new objects
        // this is not enum concept

        // internally: public static final Week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Monday"));

//        for(Week day : Week.values()) {
//            System.out.println(day);
//        }

        System.out.println(week);
//        System.out.println(week.ordinal()); // position of enum declaration
    }
}
