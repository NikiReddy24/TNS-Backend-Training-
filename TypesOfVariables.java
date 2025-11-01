class TypesOfVariables {
    public static void main(String[] args) {
        Food fobj=new Food();//creating an object of food class.
        fobj.name="Biryani";
        fobj.fav();
        System.out.println("the foods i like are:"+fobj.name+"("+fobj.spice+")\n");
        Food fobj1=new Food();//creating second object of food class.
        fobj1.name="Sambar";
        fobj1.fav();
        System.out.println("the foods i like are:"+fobj1.name+"("+fobj1.spice+")\n");
        Food fobj2=new Food();//creating third object of food class.
        fobj2.name="Butter chicken";
        fobj2.fav();
        System.out.println("the foods i like are:"+fobj2.name+"("+fobj2.spice+")\n");        
    }
}
