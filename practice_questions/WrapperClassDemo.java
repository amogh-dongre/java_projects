//Q2 Quadratic equations.
public class WrapperClassDemo
{
 public static void main(String[] args)
 {
 byte byteVar = 5;
 Byte byteobj = new Byte(byteVar);
 int intVar = 33;
 Integer intobj = new Integer(intVar);
 float floatVar = 16.8f;
 Float floatobj = new Float(floatVar);
 double doubleVar = 496.87;
 Double doubleobj = new Double(doubleVar);
 char charVar='s';
 Character charobj=charVar;
 System.out.println("Values of Wrapper objects (printing as objects)");
 System.out.println("Byte object byteobj: " + byteobj);
 System.out.println("Integer object intobj: " + intobj);
 System.out.println("Float object floatobj: " + floatobj);
 System.out.println("Double object doubleobj: " + doubleobj);
 System.out.println("Character object charobj: " + charobj);
 byte unwrappingByte = byteobj;
 int unwrappingInt = intobj;
 float unwrappingFloat = floatobj;
 double unwrappingDouble = doubleobj;
 char unwrappingChar = charobj;
 System.out.println("Unwrapped values ");
 System.out.println("byte value, unwrapped Byte: " + unwrappingByte);
 System.out.println("int value, unwrapped Int: " + unwrappingInt);
 System.out.println("float value, unwrapped Float: " + unwrappingFloat);
 System.out.println("double value, unwrapped Double: " +
unwrappingDouble);
 System.out.println("char value, unwrapped Char: " + unwrappingChar);
 Integer intObj1 = new Integer (25);
 Integer intObj2 = new Integer ("25");
 Integer intObj3= new Integer (35);
 System.out.println("Comparing using compareTo Obj1 and Obj2: " +
intObj1.compareTo(intObj2));
 System.out.println("Comparing using compareTo Obj1 and Obj3: " +
intObj1.compareTo(intObj3));
 System.out.println("Comparing using equals Obj1 and Obj2: " +
intObj1.equals(intObj2));
 System.out.println("Comparing using equals Obj1 and Obj3: " +
intObj1.equals(intObj3));
 Float f1 = new Float("2.25f");
 Float f2 = new Float("20.43f");
 Float f3 = new Float(2.25f);
 System.out.println("Comparing using compare f1 and f2: "
+Float.compare(f1,f2));
 System.out.println("Comparing using compare f1 and f3: "+Float.compare(f1,f3));
 Float f = intObj1.floatValue() + f1;
 System.out.println("Addition of intObj1 and f1: "+ intObj1 +"+" +f1+"="+f );
 }
}