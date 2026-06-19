public final class CheckJacksonAnnotations {
  public static void main(String[] args) throws Exception {
    Class.forName("com.fasterxml.jackson.annotation.JsonInclude$Include");
    System.out.println("JsonInclude$Include is on the runtime classpath");
  }
}
