package com.qichen.day16;

/**
 * 输入负数(EcDef 自定义的异常)
 * @author qichen
 * @date 2019/10/31
 * @since JDK1.8
 */
public class EcDef extends Exception {
    static final long serialVersionUID = -3387516993124229940L;

    public EcDef(){}

    public EcDef(String mwc){
        super(mwc);
    }
}
