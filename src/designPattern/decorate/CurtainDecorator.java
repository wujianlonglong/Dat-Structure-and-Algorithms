package designPattern.decorate;

/**
 * <p>
 * </p >
 *
 * @author wujianlong
 * @package designPattern.decorate
 * @date 2019-10-25 17:33
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class CurtainDecorator extends BaseDecorate {

    public CurtainDecorator(IDecorate decorate) {
        super(decorate);
    }

    /**
     * 窗帘具体装饰方法
     */
    @Override
    public void decorate() {
        System.out.println("窗帘装饰。。。");
        super.decorate();
    }


    public static void main(String[] args){
        IDecorate decorate=new Decorate();
        IDecorate curtainDecorator = new CurtainDecorator(decorate);
        curtainDecorator.decorate();

    }

}

