PIDFILE="/var/run/redis_6379_wcn.pid"

if [ -f $PIDFILE ]; then
    echo "redis-single file exists...."
    PID=$(cat $PIDFILE)
    sudo kill -9 $PID
fi
