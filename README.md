# spring-annotation
demo-01:  
1. MainConfig01
   1. `@Configuration` 注入配置类
   2. `@Bean` 注入组件 
   3. `@ComponentScan` 扫描指定包注入以下注解指定的类
      - `@Controller`
      - `@Service`
      - `@Repository`
      - `@Component`
2. MainConfig02
   1. `@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)` 设置单例或多例 默认单例
   2. `@Lazy` 懒加载，仅针对单例
3. MainConfig03
   1. `@Conditional(MyCondition.class)`和`@Bean`注解一起使用 MyCondition继承Condition重写matches方法 true-注入 false-不注入
   2. `@Import(ImportClassOne.class)`和`@Configuration`一起使用导入指定类，名称为全类名
   3. `@Import(MyImportSelector.class)`MyImportSelector实现了ImportSelector接口，重写selectImports方法，返回组件全类名数组
   4. `@Import(MyImportBeanDefinitionRegistrarClassOne.class)`MyImportBeanDefinitionRegistrarClassOne实现了ImportBeanDefinitionRegistrar接口，
   重写了registerBeanDefinitions方法，在方法里手工registerBeanDefinition
   5. `FactoryBean<>` 注入一个实现了 FactoryBean 接口的 bean，获取该 bean 时得到由 getObject 返回的 bean，
   名称前置&可以获得该FactoryBean本身