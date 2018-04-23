package core.base.concurrent.command;

import core.base.concurrent.queue.ICommandQueue;


/**
 * Created with IntelliJ IDEA.
 * Description:
 *  *  * 拥有一个队列的命令.
 *  *  * 该命令可以放入QueueDriver中执行.
 * User: FReedom
 * Date: 2018-04-23
 * Time: 15:13
 */
public interface IQueueDriverCommand  extends ICommand{

    /**
     * 获取队列id
     *
     * @return int
     */
    int getQueueId();

    /**
     * 设置队列id
     *
     * @param queueId queueId
     */
    void setQueueId(int queueId);

    /**
     * 获取所在队列
     *
     * @return ICommandQueue
     */
    ICommandQueue<IQueueDriverCommand> getCommandQueue();

    /**
     * 设置所在队列
     *
     * @param commandQueue commandQueue
     */
    void setCommandQueue(ICommandQueue<IQueueDriverCommand> commandQueue);

//    /**
//     * 获取一个额外的参数,随便存什么，具体逻辑具体使用，可以不使用该参数
//     *
//     * @return Object
//     */
//    Object getParam();
//
//    /**
//     * 设置一个额外的参数,随便存什么，具体逻辑具体使用，可以不使用该参数
//     *
//     * @param param param
//     */
//    void setParam(Object param);

}
