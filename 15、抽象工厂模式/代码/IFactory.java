//IFactory接口，定义一个创建访问User表对象的抽象工厂接口
public interface IFactory
{
    IUser createUser();

    IDepartment createDepartment();
}
/*//IFactory接口，定义一个创建访问User表对象的抽象的工厂接口
public interface IFactory
{
    IUser createUser();
}*/