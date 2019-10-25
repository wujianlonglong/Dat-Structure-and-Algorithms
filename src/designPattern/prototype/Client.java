package designPattern.prototype;

//实现Cloneable 接口的原型抽象类Prototype
   class Prototype implements Cloneable {
        //重写clone方法
        public Prototype clone(){
            Prototype prototype = null;
            try{
                prototype = (Prototype)super.clone();
            }catch(CloneNotSupportedException e){
                e.printStackTrace();
            }
            return prototype;
        }
    }
    //实现原型类
    class ConcretePrototype extends Prototype{
        public void show(){
            System.out.println("原型模式实现类");
        }
    }

    public class Client {
        public static void main(String[] args){
            ConcretePrototype cp = new ConcretePrototype();
            for(int i=0; i< 10; i++){
                ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
                clonecp.show();
            }
        }
    }
