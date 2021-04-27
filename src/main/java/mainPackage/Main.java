package mainPackage;

import outerPackage.AnotherPackageClass;

public class Main {

    public static void main(String[] args) {
        SomeClass.case1();
        case2();
        AnotherPackageClass.case3();
    }

    public static void case2 (){
            SomeClass x = new SomeClass();
            SomeClass y = new SomeClass(1, x.getB());
            SomeClass z = new SomeClass(x.getA(), 1);
            z.setA(x.getB());
            z.setB(y.getB());
            z.fieldA = 1;
            z.fieldB = 2;

            System.out.println(z.fieldA + " " + z.fieldB);
        }

    }
