>linux社区
```aidl
https://www.linuxidc.com/Linux/2019-07/159359.htm
```

>linux cmd record
```aidl
ps -ef | grep redis 查看进程号

netstat -anlp | grep 8080/lsof -i:8080

telnet ip port 查看remote port

jps查看java进程pid

kill -9 pid
```
>soft link use && redis config
```aidl
cp /opt/redis-verision/src/redis-cli /usr/local/bin/
sudo ln -s /usr/local/bin/redis-cli /usr/bin
redis-cli -v
```