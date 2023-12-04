package JSONFile;

 public class JSONFile {
     public static void main(String[] args)  {
        UtilClass util = new UtilClass();
        Car car = new Car("audi", 18000);
        util.readFile("C:\\Users\\cti22b209\\lab9\\src\\main\\java\\JSONFile\\JSONFile.txt", car);
        util.writeFile("C:\\Users\\cti22b209\\lab9\\src\\main\\java\\JSONFile\\JSONFile.txt", car);
    }
}
