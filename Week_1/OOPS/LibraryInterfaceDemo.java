interface LibraryUser
{
    void registerAccount();
    void requestBook();
}

class KidUser implements LibraryUser
{
    int age;
    String booktype;

    @Override
    public void registerAccount(){
       if(age<12){
        System.out.println("success");
       }
       else{
        System.out.println("you must be below 12 to register as KidUser");
       }

    }

    @Override
    public void requestBook(){
        if(booktype.equals("Kids")){
            System.out.println("book is issued");
        }
        else{
            System.out.println("please issue a kids appropriate book");
        }
    }
}

class AdultUser implements LibraryUser
{
    int age;
    String booktype;

    @Override
    public void registerAccount()
    {
        if(age>12){
        System.out.println("success");
       }
       else{
        System.out.println("you must be above 12 to register as an AdultUser");
       }
    }

    @Override
    public void requestBook()
    {
        if(booktype.equals("Fiction")){
            System.out.println("book is issued");
        }
        else{
            System.out.println("please issue an adult appropriate book");
        }
    }
}

public class LibraryInterfaceDemo
{
    public static void main(String[] args)
    {
        KidUser kid = new KidUser();

        kid.age = 10;
        kid.registerAccount();

        kid.age = 18;
        kid.registerAccount();

        kid.booktype = "Kids";
        kid.requestBook();

        kid.booktype = "Fiction";
        kid.requestBook();


        AdultUser adult = new AdultUser();

        adult.age = 5;
        adult.registerAccount();

        adult.age = 23;
        adult.registerAccount();

        adult.booktype = "Kids";
        adult.requestBook();

        adult.booktype = "Fiction";
        adult.requestBook();
    }
}

