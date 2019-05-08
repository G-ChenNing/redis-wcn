PIDFILE1="/var/run/redis_5001.pid"
PIDFILE2="/var/run/redis_5002.pid"
PIDFILE3="/var/run/redis_5003.pid"
PIDFILE4="/var/run/redis_5004.pid"
PIDFILE5="/var/run/redis_5005.pid"
PIDFILE6="/var/run/redis_5006.pid"
 
if [ -f $PIDFILE1 ]; then
    echo "redis-5001 file exists...." 
    PID=$(cat $PIDFILE1) 
    sudo kill -9 $PID
fi

if [ -f $PIDFILE2 ]; then
    echo "redis-5002 file exists...." 
    PID=$(cat $PIDFILE2)           # 将PID从文件中读取，并作为一个变量
    sudo kill -9 $PID
fi

if [ -f $PIDFILE3 ]; then
    echo "redis-5003 file exists...." 
    PID=$(cat $PIDFILE3)           # 将PID从文件中读取，并作为一个变量
    sudo kill -9 $PID
fi

if [ -f $PIDFILE4 ]; then
    echo "redis-5004 file exists...." 
    PID=$(cat $PIDFILE4)           # 将PID从文件中读取，并作为一个变量
    sudo kill -9 $PID
fi

if [ -f $PIDFILE5 ]; then
    echo "redis-5005 file exists...." 
    PID=$(cat $PIDFILE5)           # 将PID从文件中读取，并作为一个变量
    sudo kill -9 $PID
fi

if [ -f $PIDFILE6 ]; then
    echo "redis-5006 file exists...." 
    PID=$(cat $PIDFILE6)           # 将PID从文件中读取，并作为一个变量
    sudo kill -9 $PID
fi

