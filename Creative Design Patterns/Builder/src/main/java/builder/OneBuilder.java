package builder;

public class OneBuilder extends AbstractBuilder {
   public OneBuilder(Person person){
       this.person = person;
   }

   @Override
   public void dressHail(){
       this.person.dress.add("dress black hail");
   }

   @Override
   public void dressBody(){
       this.person.dress.add("dress black body");
   }

   @Override
   public void dressFeet(){
       this.person.dress.add("dress black feet");
   }
}
