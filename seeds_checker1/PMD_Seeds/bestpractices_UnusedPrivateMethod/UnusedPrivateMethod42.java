import java.util.List;

class TestPrivate<T extends List> {
  protected Object getProtected(final T bean) {
    return getPrivate(bean);
  }

  private Object getPrivate(final List bean) {
    return bean;
  }
}
