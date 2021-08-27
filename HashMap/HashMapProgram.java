package hashmapprogram;
import java.util.*;
public class HashMapProgram{
static Scanner input = new Scanner(System.in);

public static int getIntegerInput(){
int number;
try {
number = input.nextInt();
} catch (InputMismatchException e) {
System.out.println("Invalid Input.Enter the valid Input");
input.next();
number=getIntegerInput(); 
}
return number;
}

public static String getStringInput() {
String str= input.next();
return str;
}



public static HashMap createHashMap(){
 HashMap hash = new HashMap();
 return hash;
 }
 
 public static int printHashMapSize(Map hash) {
 int size=hash.size();
 return size;
 }
 
 public static Map<String,String> createStringInputMap() {
 System.out.println("Enter the number of pairs: ");
 int pair=getIntegerInput();
 Map<String,String> hash = new HashMap<String,String>();
 for(int i=0;i<pair;i++) {
 System.out.println("Enter key: ");
 String key = getStringInput();
 System.out.println("Enter value: ");
 String value = getStringInput();
 hash.put(key,value);
 }
 return hash;
 }
 
 public static Map<Integer,Integer> createIntegerInputMap() {
 System.out.println("Enter the number of pairs: ");
 int pair=getIntegerInput();
 Map<Integer,Integer> hash = new HashMap<Integer,Integer>();
 for(int i=0;i<pair;i++) {
 System.out.println("Enter key: ");
 int key = getIntegerInput();
 System.out.println("Enter value: ");
 int value = getIntegerInput();
 hash.put(key,value);
 }
 return hash;
 }
 
 public static Map<String,Integer> createStrIntInputMap() {
 System.out.println("Enter the number of pairs: ");
 int pair=getIntegerInput();
 Map<String,Integer> hash = new HashMap<String,Integer>();
 for(int i=0;i<pair;i++) {
 System.out.println("Enter key: ");
 String key = getStringInput();
 System.out.println("Enter value: ");
 int value = getIntegerInput();
 hash.put(key,value);
 }
 return hash;
 }
 

   
  public static List<Employee> getEmpDetail(){
  List<Employee> list =new ArrayList<>();
   System.out.println("Enter the Employee ID: "); 
   Integer id = getIntegerInput();
   System.out.println("Enter the Name: ");
   String name= getStringInput();
   System.out.println("Enter the City: ");
   String city=getStringInput();
   Employee emp = new Employee();
   emp.setId(id);
   emp.setName(name);
   emp.setCity(city);
   list.add(emp);
   return list;
   }
   
 public static Map<String,List> createStrObjInputMap() {
 System.out.println("Enter the number of pairs: ");
 int pair=getIntegerInput();
 Map<String,List> hash = new HashMap<>();
 for(int i=0;i<pair;i++) {
 System.out.println("Enter key: ");
 String key = getStringInput();
 System.out.println("Enter value: ");
 List value =getEmpDetail();
 hash.put(key,value);
 }
 return hash;
 }
 
 public static boolean checkKeyExists(Map<String,String> map,String checkKey) { 
if(map==null) {
 return false;
 }
  return map.containsKey(checkKey);
 }
 
 public static boolean checkValueExists(Map<String,String> map,String checkValue) { 
 if(map==null) {
 return false;
 }
 return map.containsValue(checkValue);
 }
 
 public static Map<String,String> replaceValue(Map<String,String> map,String replaceValue) {
 if(map==null){
 return null;
 }
 map.replaceAll((oldKey,oldValue)-> oldValue + replaceValue); 
 return map;
 }

 public static String findValue(Map<String,String> map,String checkKey){
 if(map==null) {
 return null;
 }
 String value = map.get(checkKey); 
 return value;
 }
 
 public static String findValueNonExisting(Map<String,String> map,String checkKey){
  if(map==null) {
 return null;
 }
 String output = map.getOrDefault(checkKey,"zoho"); 
 return output;
 
 }
 
 public static Map<String,String> removeExistingKey(Map<String,String> map,String removeKey){
  if(map==null) {
 return null;
 }
  map.remove(removeKey); 
  return map;
 }
 
 
 public static Map<String,String> removeExistingKeyIfValueEquals(Map<String,String> map,String removeKey,String removeValue){
  if(map==null) {
 return null;
 }
 String getValue = map.get(removeKey);
  if(getValue.equals(removeValue)) {
  map.remove(removeKey); 
 } else {
 System.out.println("Key does not match");
 }
 return map;
 }
 
 public static Map<String,String> replaceValueIfExists(Map<String,String> map,String checkKey,String checkValue ){
  if(map==null) {
 return null;
 }
 map.replace(checkKey,checkValue);
 return map;
 }
 
 
 public static Map<String,String> replaceExistingKey(Map<String,String> map,String replaceKey,String value,String replaceValue){
  if(map==null) {
 return null;
 }
 String getValue = map.get(replaceKey);
  if(getValue.equals(value)) {
  map.replace(replaceKey,replaceValue); 
 } else {
 System.out.println("Key does not match ");
 }
 return map;
 }
 
 public static Map<String,String> transferHashMap(Map<String,String> map,Map<String,String> secondMap){
 if(map==null||secondMap==null) {
 return null;
 }
 secondMap.putAll(map);
 return secondMap;
 }
 
 
 public static void iterateOverHashMap(Map<String,String> map){
  if(map==null) {
 return;
 }
 for(Map.Entry<String,String> set:map.entrySet()) {
 System.out.println(set.getKey() + "=" + set.getValue());
 }
 }
 
 public static Map<String,String> removeAllEntries(Map<String,String> map){
  if(map==null) {
 return null;
 }
 map.clear();
 return map;
 }
 
 
 
 public static void main(String[] args) {
 System.out.println("Enter the Question No: ");
 int questionNo=getIntegerInput();
 switch(questionNo) {
 case 1:
 Map hashMap1=createHashMap();
 System.out.println("HashMap: "+hashMap1);
 System.out.println("Size: "+printHashMapSize(hashMap1));
 break;
 case 2:
 Map<String,String> hashMap2=createStringInputMap();
 System.out.println("HashMap: "+hashMap2);
 System.out.println("Size: "+printHashMapSize(hashMap2));
 break;
 case 3:
 Map<Integer,Integer> hashMap3=createIntegerInputMap();
 System.out.println("HashMap: "+hashMap3);
 System.out.println("Size: "+printHashMapSize(hashMap3));
 break;
 case 4:
 Map<String,Integer> hashMap4=createStrIntInputMap();
 System.out.println("HashMap: "+hashMap4);
 System.out.println("Size: "+printHashMapSize(hashMap4));
 break;
 case 5:
 Map<String,List> hashMap5=createStrObjInputMap();
 System.out.println("HashMap: "+hashMap5);
 System.out.println("Size: "+printHashMapSize(hashMap5));
 break;
 case 6:
 Map<String,Integer> hashMap6=createStrIntInputMap();
 System.out.println("HashMap: "+hashMap6);
 System.out.println("Size: "+printHashMapSize(hashMap6));
 break;
 case 7:
 Map<Integer,Integer> hashMap7=createIntegerInputMap();
 System.out.println("HashMap: "+hashMap7);
 System.out.println("Size: "+printHashMapSize(hashMap7));
 break;
 case 8:
 Map<String,String> hashMap8 = createStringInputMap();
  System.out.println("HashMap: "+hashMap8);
 System.out.println("Size: "+printHashMapSize(hashMap8));
 System.out.println("Enter the Key to check: ");
 String checkKey8 = getStringInput();
System.out.println(checkKeyExists(hashMap8,checkKey8));
 break;
 case 9:
 Map<String,String> hashMap9= createStringInputMap();
  System.out.println("HashMap: "+hashMap9);
 System.out.println("Size: "+printHashMapSize(hashMap9));
 System.out.println("Enter the Value to check: ");
 String checkKey9 = getStringInput();
System.out.println(checkValueExists(hashMap9,checkKey9));
 break;
 case 10:
 Map<String,String> hashMap10 = createStringInputMap();
 System.out.println("HashMap: "+hashMap10);
 System.out.println("Size: "+printHashMapSize(hashMap10));
 System.out.println("Enter the String to Replace All: ");
 String replaceValue = getStringInput();
 System.out.println("HashMap: "+replaceValue(hashMap10,replaceValue));
 System.out.println("Size: "+printHashMapSize(hashMap10));
 break;
 case 11:
 Map<String,String> hashMap11 = createStringInputMap();
 System.out.println("Enter the Key to check existing: ");
 String checkKey11 =getStringInput();
 System.out.println("Value for existing key: "+ findValue(hashMap11,checkKey11));
 break;
 case 12:
 Map<String,String> hashMap12 = createStringInputMap();
  System.out.println("Enter the Key to check non exixting : ");
 String checkKey12 =getStringInput();
 System.out.println("Value for Non-existing key: "+ findValue(hashMap12,checkKey12));
 break;
 case 13:
 Map<String,String> hashMap13 = createStringInputMap();
  System.out.println("Enter the Key to check: ");
 String checkKey13 =getStringInput();
 System.out.println("the value: "+findValueNonExisting(hashMap13,checkKey13));
 break;
 case 14:
 Map<String,String> hashMap14 = createStringInputMap();
 System.out.println("The HashMap: "+ hashMap14);
 System.out.println("Size of HashMap: "+printHashMapSize(hashMap14));
 System.out.println("Enter the Key to remove: ");
  String removeKey14 =getStringInput();
 System.out.println("HashMap After remove: "+ removeExistingKey(hashMap14,removeKey14));
 System.out.println("Size of the hashmap: "+ printHashMapSize(hashMap14));
 break;
 case 15:
 Map<String,String> hashMap15 = createStringInputMap();
 System.out.println("The HashMap: "+ hashMap15);
 System.out.println("Size of HashMap: "+printHashMapSize(hashMap15));
 System.out.println("Enter the Key to remove: ");
  String removeKey15 =getStringInput();
  System.out.println("Enter the Value of the Key: ");
  String removeValue15=getStringInput();
 Map<String,String> map15=removeExistingKeyIfValueEquals(hashMap15,removeKey15,removeValue15);
 System.out.println("HashMap After remove: "+ map15);
 System.out.println("Size of the hashmap: "+ printHashMapSize(map15));
 break;
 case 16:
 Map<String,String> hashMap16 = createStringInputMap();
  System.out.println("The HashMap: "+ hashMap16);
 System.out.println("Size of HashMap: "+printHashMapSize(hashMap16));
 System.out.println("Enter the Key to replace: ");
 String checkKey16 =getStringInput();
 System.out.println("Enter the Value: ");
 String checkValue16 =getStringInput();
 Map<String,String> map16=replaceValueIfExists(hashMap16,checkKey16,checkValue16);
 System.out.println("HashMap After replace: "+ map16);
 System.out.println("Size of the hashmap: "+ printHashMapSize(map16));
 break;
 case 17:
 Map<String,String> hashMap17 = createStringInputMap();
 System.out.println("The HashMap: "+ hashMap17);
 System.out.println("Size of HashMap: "+printHashMapSize(hashMap17));
 System.out.println("Enter the Key to replace: ");
  String replaceKey17 =getStringInput();
  System.out.println("Enter the Value of the key");
  String value17 =getStringInput();
  System.out.println("Enter the Value to replace: ");
  String replaceValue17=getStringInput();
 Map<String,String> map17=replaceExistingKey(hashMap17,replaceKey17,value17,replaceValue17);
 System.out.println("HashMap After replace: "+ map17);
 System.out.println("Size of the hashmap: "+ printHashMapSize(map17));
 break;
 case 18:
 Map<String,String> firstMap = createStringInputMap();
  System.out.println("The HashMap: "+firstMap);
 System.out.println("Size of HashMap: "+printHashMapSize(firstMap));
 Map<String,String> secondMap =createStringInputMap();
 System.out.println("The HashMap: "+secondMap);
 System.out.println("Size of HashMap: "+printHashMapSize(secondMap));
 Map<String,String> map18=transferHashMap(firstMap,secondMap);
 System.out.println("HashMap After transfer: "+ map18);
 System.out.println("Size of the hashmap: "+ printHashMapSize(map18));
 break;
 case 19:
 Map<String,String> hashMap19 = createStringInputMap();
 iterateOverHashMap(hashMap19);
 break;
 case 20:
 Map<String,String> hashMap20 = createStringInputMap();
 System.out.println("The HashMap: "+ hashMap20);
 System.out.println("Size of HashMap: "+printHashMapSize(hashMap20));
  Map<String,String> map20=removeAllEntries(hashMap20 );
 System.out.println("HashMap After clear: "+ map20);
 System.out.println("Size of the hashmap: "+ printHashMapSize(map20));
 break;
 default :
 System.out.println("Invalid Input");
 break;
 }
 }
 public static void closeScanner() {
 input.close();
}

 }
 
