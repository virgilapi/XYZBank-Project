package loadableComponent;

public abstract class CustomLoadableComponent {

    public <T extends CustomLoadableComponent> T get(){
      try {
          isLoaded();
          return (T) this;
      }catch (Exception e){
          System.out.println(e);
          load();
      }
        isLoaded();
        return (T) this;
    }

    public abstract void load();
    public abstract void isLoaded()throws Error;
}
