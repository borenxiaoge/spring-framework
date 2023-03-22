package org.springframework.mytest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author liboren
 */
@Component
public class ComponentC extends ComponentA{
	@Autowired
	ComponentA  componentA;
}
