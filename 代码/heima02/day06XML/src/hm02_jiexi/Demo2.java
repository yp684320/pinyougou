package hm02_jiexi;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Demo2 {
    public static void main(String[] args) throws DocumentException {
        //����SaxReader����
        SAXReader rs = new SAXReader();
        //��ȡ�ĵ�  �����ĵ�����
        Document document = rs.read("Demo2.xml");
        //��ȡ��Ԫ��
        Element root = document.getRootElement();
        //ͨ����Ԫ��  ��ȡ��Ԫ��
        List<Element> list = root.elements();
        //��������
        for (Element bean : list) {
            System.out.println(bean.getName());
            //��ȡ�ӱ�ǩ
            List<Element> list1 = bean.elements();
            //��������
            for (Element property : list1) {
                String name = property.attributeValue("name");
                String value = property.attributeValue("value");
                System.out.println(name+" "+value);
                //��ȡ�ı�
                String text = property.getText();
                System.out.println(text);
            }
        }
    }
}
