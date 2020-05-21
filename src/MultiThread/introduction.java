package Runable;

/** 线程的核心概念：
 *      1.线程就是独立的执行路径
 *      2.在程序运行时，即使你没有创建线程，后台也会有多个线程，如主线程（main），gc线程
 *      3.线程的运行由调度器安排，先后顺序是不能人为的干预
 *      4.同一份资源会存在资源抢夺的问题，需要加入并发控制
 *      5.线程会带来额外的开销，如cpu调度时间，并发控制开销
 *      6.每个线程在自己的工作内存交互，内存控制不当会造成数据的不一致。
 *
 *      并发：指两个或多个事件在同一个时间段内发生
 *      并行：两个或多个事件在同一时刻发生
 *
 *      进程：是指一个内存中运行的应用程序，每个进程都有一个独立的内存空间，一个应用程序可以同时运行多个进程；进程也是程序的一次执行过程，是系统运行程序的基本单位；系统运行一个程序即是一个进程从创建、运行到消亡的过程。
 *      线程：线程是进程中的一个执行单元，负责当前进程中程序的执行，一个进程中至少有一个线程。一个进程中是可以有多个线程的，这个应用程序也可以称之为多线程程序。
 *      简而言之：一个程序运行后至少有一个进程，一个进程中可以包含多个线程
 */

