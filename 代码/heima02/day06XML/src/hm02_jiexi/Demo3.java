package hm02_jiexi;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Demo3 {
    public static void main(String[] args) throws DocumentException {
        //��ȡSAXreader����
        SAXReader sr = new SAXReader();
        //��ȡ�ĵ� ��ȡ�ĵ�����
        Document document = sr.read("Demo3.xml");
        //��ȡ��Ԫ��
        Element root = document.getRootElement();
        System.out.println(root.getName());
        //ͨ����Ԫ�ػ�ȡ��Ԫ��
        List<Element> list = root.elements();
        //��������
        for (Element property : list) {
            String value = property.attributeValue("value");
            System.out.println(value);
        }
    }
}
