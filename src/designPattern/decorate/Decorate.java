package designPattern.decorate;

/**
 * <p>
 * </p >
 *
 * @author wujianlong
 * @package designPattern.decorate
 * @date 2019-10-25 17:20
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class Decorate implements IDecorate {

    @Override
    public void decorate() {
        System.out.println("木工加工木头");
    }
}
