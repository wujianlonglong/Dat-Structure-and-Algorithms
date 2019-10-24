package stack;

/**
 * <p>
 *  基于栈实现的浏览器前进后退功能
 * </p >
 *
 * @author wujianlong
 * @package stack
 * @date 2019-10-24 10:15
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class Browser {

    StackLinked a=new StackLinked(10);
    StackLinked b=new StackLinked(10);


    /**
     * 跳转新页面
     * @param page
     */
    public void newPage(int page){
        //清空b栈的所有元素
        b.cleanAll();
        //a栈入栈
        a.push(page);
    }

    /**
     * 前进
     */
    public void forward(){
        //b栈出栈
        int data=b.pop();
        //a栈入栈
        a.push(data);
    }

    /**
     * 后退
     */
    public void backoff(){
        //a栈出栈
        int data=a.pop();
        //b栈入栈
        b.push(data);
    }

    /**
     * 展示当前页
     */
    public void nowPage(){
        a.printHead();
    }



    public static void main(String[] args){
        Browser browser=new Browser();
        browser.newPage(1);
        browser.nowPage();
        browser.newPage(2);
        browser.newPage(3);
        browser.nowPage();
        browser.newPage(4);
        browser.nowPage();

        browser.backoff();
        browser.nowPage();

        browser.backoff();
        browser.nowPage();

        browser.newPage(5);
        browser.nowPage();


        browser.forward();
        browser.nowPage();

        browser.forward();
        browser.nowPage();

    }

}
