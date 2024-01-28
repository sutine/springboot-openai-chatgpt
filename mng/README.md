# Chat gpt Mng

## 后台

docker login --username=service@cicene.com registry.cn-shenzhen.aliyuncs.com

docker tag blade-auth registry.cn-shenzhen.aliyuncs.com/cicene/blade-auth
docker push registry.cn-shenzhen.aliyuncs.com/cicene/blade-auth

docker tag blade-gateway registry.cn-shenzhen.aliyuncs.com/cicene/blade-gateway
docker push registry.cn-shenzhen.aliyuncs.com/cicene/blade-gateway

docker tag blade-message registry.cn-shenzhen.aliyuncs.com/cicene/blade-message
docker push registry.cn-shenzhen.aliyuncs.com/cicene/blade-message

docker tag blade-mjkj registry.cn-shenzhen.aliyuncs.com/cicene/blade-mjkj
docker push registry.cn-shenzhen.aliyuncs.com/cicene/blade-mjkj

docker tag blade-system registry.cn-shenzhen.aliyuncs.com/cicene/blade-system
docker push registry.cn-shenzhen.aliyuncs.com/cicene/blade-system

docker tag blade-user registry.cn-shenzhen.aliyuncs.com/cicene/blade-user
docker push registry.cn-shenzhen.aliyuncs.com/cicene/blade-user
