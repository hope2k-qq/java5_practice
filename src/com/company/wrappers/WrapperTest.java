package com.company.wrappers;

public class WrapperTest {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10);
        Integer i3 = new Integer(10);
        Integer i4 = Integer.parseInt("10");

        Byte byte1 = 10;
        Byte byte2 = Byte.valueOf("10");
        Byte byte3 = new Byte("10");
        Byte byte4 = Byte.parseByte("10");

        Short short1 = 10;
        Short short2 = Short.valueOf("10");
        Short short3 = new Short("10");
        Short short4 = Short.parseShort("10");

        Long long1 = 10L;
        Long long2 = Long.valueOf(10L);
        Long long3 = new Long(10L);
        Long long4 = Long.parseLong("10");

        Float float1 = 10.23f;
        Float float2 = Float.valueOf(10.23f);
        Float float3 = new Float(10.23f);
        Float float4 = Float.parseFloat("10.23");

        Double double1 = 10.22;
        Double double2 = Double.valueOf(10.22);
        Double double3 = new Double(10.22);
        Double double4 = Double.parseDouble("10.22");

        Boolean boolean1 = true;
        Boolean boolean2 = Boolean.valueOf(true);
        Boolean boolean3 = new Boolean(true);
        Boolean boolean4 = Boolean.parseBoolean("true");

        Character character1 = 'q';
        Character character2 = Character.valueOf('q');
        Character character3 = new Character('q');

        Double d1 = 10.23;
        byte b1 = d1.byteValue();
        short s1 = d1.shortValue();
        int int1 = d1.intValue();
        float f1 = d1.floatValue();
        long l1 = d1.longValue();

        Double d2 = 0.0;
        Double d3 = 2.0;
        Double nanValue = d2 / d2;
        Double infinityValue = d3 / d2;
        System.out.println(nanValue);
        System.out.println(infinityValue);
        if (nanValue.isNaN()) {
            System.out.println("Variable nanValue = NaN");
        }
        if (nanValue.isInfinite()) {
            System.out.println("Variable nanValue = Infinity");
        }
        if (infinityValue.isNaN()) {
            System.out.println("Variable infinityValue = NaN");
        }
        if (infinityValue.isInfinite()) {
            System.out.println("Variable infinityValue = Infinity");
        }

        Long l2 = 120L;
        Long l3 = 120L;
        if(l2 == l3){
            System.out.println("+++");
        } else {
            System.out.println("---");
        }
        l2 = 1200L;
        l3 = 1200L;
        if(l2 == l3){
            System.out.println("+++");
        } else {
            System.out.println("---");
        }
    }
}
