package charArrow;

public class CharArrow {
   public static void main(String[] args) {
      char arrowBody;
      char arrowHead;

      arrowBody = '-';
      arrowHead = '>';

      System.out.println(arrowHead);
      System.out.println("" + arrowBody + arrowBody + arrowBody + arrowHead);

      arrowBody = 'o';

      System.out.println("" + arrowBody + arrowBody + arrowBody + arrowHead);
   }
}