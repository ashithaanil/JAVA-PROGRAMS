class product
{
    int pcode;
    String pname;
    double price;
}
public class pdtprice
{
    public static void main(String[] args)
 {
        product p1=new product();
        product p2=new product();
        product p3=new product();
        p1.pcode=101;
        p1.pname="DELL";
        p1.price=67000;
        p2.pcode=102;
        p2.pname="HP";
        p2.price=57000;
        p3.pcode=103;
        p3.pname="APPLE";
        p3.price=95000;
        if ((p1.price<p2.price) && (p1.price<p3.price))
        {
            System.out.println("lowest price is : "+p1.price);
        }
        else if ((p2.price<p1.price) && (p2.price<p3.price))
        {
            System.out.println("lowest price is : "+p2.price);

        }
        else
        {
            System.out.println("lowest price is : "+p3.price);

        }
        
      
    }
  }