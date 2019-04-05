package com.major;

public class Main {

    public static void main(String[] args) {
        int normalInt;
        Integer objectInt;
        byte normalByte;
        Byte objectByte;
        long normalLong;
        Long objectLong;
        double normalDouble;
        Double objectDouble;
        Double objectDoubleSecond;
        char normalChar;
        Character objectChar;
        boolean normalBoolean;
        Boolean objectBoolean;
        String isOnlyObj;

        normalInt = 5;
        objectInt = 5;
        normalDouble=10.0;
        objectDouble=10D;
        objectDoubleSecond=11D;
        isOnlyObj="isNaN check       ";
        objectBoolean = true;
        //System.out.println(normalInt+objectInt);//auto conversion
        //System.out.println(objectInt.byteValue());//basically same as number //value of a byte
        //System.out.println(objectInt.compareTo(3));//returns 1 if higher than value in compareTo(),0 if its equal,-1if its lower
        //System.out.println(objectInt.doubleValue());//returns double(convert to double?!)
        //System.out.println(objectInt.equals(5));//return true if equals and false if not
        //System.out.println(objectInt.floatValue());//return number as float
        //System.out.println(objectInt.hashCode());//returns unique value number of object?!
        //System.out.println(objectDouble.hashCode());//it depends on value if used to same obj?
        //System.out.println(objectDoubleSecond.hashCode());//it changes value depends on different objects and values represented by them
        //System.out.println(objectDouble.isInfinite());//returns false if not infinity and true if it is;
        //System.out.println(objectDouble.isNaN());//false if number, true if not a number
        //System.out.println((objectDouble.toString()+objectDoubleSecond.toString())+" changes to string");//checked if it can auto convert and it cant;
        //System.out.println(isOnlyObj);//does not have isNaN
        //System.out.println(objectInt.getClass());//return class name
        //System.out.println(objectBoolean.getClass());
        //normal dataTypes do not have those methods inherited form java.Object class
        //System.out.println(isOnlyObj.compareTo("isNaN check"));//0 if same
        //System.out.println(isOnlyObj.compareTo("asNaN check"));//it depends on difference between unicode or ASCII on character positions
        //System.out.println("aac".compareTo("bbd"));
        //System.out.println("bc".compareTo("ba"));//lexicographic order?!
        //System.out.println(isOnlyObj.charAt(3));//value of a char in string based on position starting from 0 like in tabs
        //System.out.println(isOnlyObj.charAt(0));
        //System.out.println(isOnlyObj.codePointAt(0));//return ASCII
        //System.out.println(isOnlyObj.codePointBefore(1));//return ASCII of one char before index
        //System.out.println(isOnlyObj.codePointCount(0,1));//number of ASCII codes?!
        //System.out.println(isOnlyObj.getBytes());
        //System.out.println(isOnlyObj.offsetByCodePoints(2,3));
        //System.out.println(isOnlyObj.trim()+"|");//trims blank spaces at the end of string
        //System.out.println(isOnlyObj.intern()=="Yeti");//returns true or false depends on obj.equals(obj2)//something with canonical interpretation?!?!?!?!?!
        //System.out.println(isOnlyObj.toUpperCase());
        //there are lots of inherited methods from java.Object based on regex
        loopTypes loop1 = new loopTypes();
        //loop1.forLoop(normalInt);
        //loop1.forLoop(objectInt);
        loop1.whileLoop(normalInt);
        loop1.whileLoop(objectInt);
        loop1.doWhileLoop(6);
        loop1.doWhileLoop(-2);//it always runs once before it checks while statement
        String[] dataTypes = new String[] { "int","Integer","byte","Byte" };
        loop1.forEach(dataTypes);
    }
}
