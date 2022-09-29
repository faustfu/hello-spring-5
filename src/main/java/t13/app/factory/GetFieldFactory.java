package t13.app.factory;

import org.springframework.beans.factory.FactoryBean;

public class GetFieldFactory implements FactoryBean<Object> {
    private String targetClass;
    private String targetField;

    public void setTargetClass(String targetClass) {
        this.targetClass = targetClass;
    }

    public void setTargetField(String targetField) {
        this.targetField = targetField;
    }

    @Override
    public Object getObject() throws Exception {
        var clazz = Class.forName(targetClass);
        var field = clazz.getField(targetField);
        return field.get(null);
    }

    @Override
    public Class<?> getObjectType() {
        return Object.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
