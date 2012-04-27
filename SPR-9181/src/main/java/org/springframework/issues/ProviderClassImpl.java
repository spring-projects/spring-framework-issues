package org.springframework.issues;

import org.springframework.context.annotation.Scope;

import javax.inject.Named;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

/**
 * TODO Beschreibung angeben
 *
 * @author andr
 */
@Named
@Scope(SCOPE_PROTOTYPE)
public class ProviderClassImpl<T extends Object, Y extends Object> implements ProviderClass<T,Y> {

    public ProviderClassImpl(){

    }
}
