# spring
# wish message

## first issue is faced " org.springframework.beans.factory.BeanDefinitionStoreException: IOException parsing XML document from file [C:\workspace\WishMessageApp\com\hcl\config\ApplicationContext.xml]; nested exception is java.io.FileNotFoundException: com\hcl\config\ApplicationContext.xml (The system cannot find the path specified)

# solution
  ## check provided  xml config file path  

## while working with wish message app faced  org.springframework.beans.factory.CannotLoadBeanClassException: Cannot find class [com.hcl.beans.WishMesssage] for bean with name 'wm' defined in file this issue
# solution
  ## check class name in configuration file

# org.springframework.beans.factory.UnsatisfiedDependencyException
## org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'wmg' defined in file [C:\Users\dmk61\git\spring\WishAppByContructorInj\src\com\hcl\config\Config1.xml]: Unsatisfied dependency expressed through constructor argument with index 0 of type [java.util.Date]: Ambiguous constructor argument types - did you specify the correct bean references as constructor arguments?
# constructor inj
 ## while passing depndent obj to target class by constructor inj don't declare name="date". just pass ref in <con>.
 
