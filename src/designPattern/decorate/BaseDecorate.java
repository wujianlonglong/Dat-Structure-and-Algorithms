package designPattern.decorate;

/**
 * <p>
 * </p >
 *
 * @author wujianlong
 * @package designPattern.decorate
 * @date 2019-10-25 17:23
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public abstract class BaseDecorate implements IDecorate{

    private IDecorate decorate;

    public BaseDecorate(IDecorate decorate){
        this.decorate=decorate;
    }

    public void decorate(){
        if(decorate!=null){
            decorate.decorate();
        }
    }


}
