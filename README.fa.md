# discovery-server



#### اول اینکه Microservice چیست؟
در حقیقت Microservice Architecture یک سبک معماری نرم‌افزاری است که در آن یک سیستم بزرگ به مجموعه‌ای از سرویس‌های کوچک، مستقل و قابل استقرار جداگانه تقسیم می‌شود.

هر microservice:
- یک مسئولیت مشخص (Single Responsibility) دارد

- می‌تواند مستقل توسعه، تست و deploy شود

- معمولاً از طریق HTTP/REST یا پیام‌رسانی (Kafka, RabbitMQ) با سرویس‌های دیگر ارتباط دارد

#### تفاوت Microservice با Monolith
| Monolith          | Microservice           |
| ----------------- | ---------------------- |
| یک اپلیکیشن بزرگ  | چند سرویس کوچک         |
| Deploy یک‌جا      | Deploy مستقل           |
| وابستگی شدید اجزا | Loose Coupling         |
| Scale کل سیستم    | Scale هر سرویس جداگانه |


#### ویژگی‌های اصلی Microservice
✅ استقلال سرویس‌ها

هر سرویس دیتابیس خودش را دارد (Database per Service)

✅ قابلیت مقیاس‌پذیری بالا

فقط سرویس پرمصرف scale می‌شود

✅ تکنولوژی مستقل

هر سرویس می‌تواند با زبان یا فریم‌ورک متفاوتی نوشته شود

✅ و Fault Isolation

خرابی یک سرویس کل سیستم را نمی‌خواباند


#### و Microservice در Spring Boot
در پروژه‌های Java معمولاً از این ابزارها استفاده می‌شود:

- اول Spring Boot → ساخت سرویس‌ها

- و Spring Cloud → Service Discovery, Config, Gateway

- و Eureka / Consul → ثبت سرویس‌ها

- و API Gateway → ورودی واحد سیستم

- و Feign Client / RestTemplate / WebClient → ارتباط بین سرویس‌ها

- و Docker & Kubernetes → استقرار و مدیریت