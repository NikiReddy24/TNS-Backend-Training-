//main class for cartoon class
class democlassandobj{
public static void main(String[] args) {
        //creating an object of cartoon class.
        Cartoon cobj=new Cartoon();
        cobj.name="Miraculous";
        cobj.moral="Superhero";
        cobj.language="French";
        //creating a second object of cartoon class.
        Cartoon cobj1=new Cartoon();
        cobj1.name="Tom & Jerry";
        cobj1.moral="Comedy";
        cobj1.language="English";
        //creating a third object of cartoon class.
        Cartoon cobj2=new Cartoon();
        cobj2.name="Miraculous";
        cobj2.moral="Superhero";
        cobj2.language="French";
        System.out.println("the cartoons which i like so much are:\n"+cobj.name+"\n"+cobj.moral+"\n"+cobj.language);
        System.out.println("the cartoons which i like so much are:\n"+cobj1.name+"\n"+cobj1.moral+"\n"+cobj1.language);
        System.out.println("the cartoons which i like so much are:\n"+cobj2.name+"\n"+cobj2.moral+"\n"+cobj2.language);
    }
}