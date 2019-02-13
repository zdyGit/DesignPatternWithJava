package builder;

public class TwoBuilder extends AbstractBuilder {
   public TwoBuilder(Person person){
       this.person = person;
   }

   @Override
   public void dressHail(){
       this.person.dress.add("dress red hail");
   }

   @Override
   public void dressBody(){
       this.person.dress.add("dress red body");
   }

   @Override
   public void dressFeet(){
       this.person.dress.add("dress red feet");
   }
}
