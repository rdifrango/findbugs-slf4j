package jp.skypencil.findbugs.slf4j;

import java.util.Collections;
import java.util.Map;

import org.junit.Test;

public class UsingOuterClassTest {
  @Test
  public void test() {
    Map<String, Integer> expected = Collections.emptyMap();
    new XmlParser().expect(pkg.UsingOuterClass.class, expected);
  }
}
