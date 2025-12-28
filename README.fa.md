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


#### چه زمانی Microservice انتخاب خوبی است؟
✔ سیستم بزرگ و در حال رشد

✔ تیم‌های توسعه مستقل

✔ نیاز به scalability بالا

✔ و CI/CD قوی

#### یک تعریف کوتاه مخصوص مصاحبه
Microservices are a software architecture style where an application is composed of small, independent services that communicate over well-defined APIs and can be developed, deployed, and scaled independently.



#### و اینکه Monolith چیست؟
در حقیقت Monolith یا Monolithic Architecture یعنی یک نرم‌افزار بزرگ که همه اجزای آن در یک برنامه واحد و یک Deployment قرار دارند.

به زبان ساده: همه چیز با هم بسته شده و به هم وابسته است.


#### ویژگی‌های Monolith
✅ یکپارچگی بالا

کد، دیتابیس و رابط کاربری معمولاً در یک برنامه هستند.

✅ سادگی در توسعه اولیه

شروع پروژه سریع و راحت است، نیازی به پیچیدگی Microservice ندارد.


✅ یک Deployment

همه تغییرات با هم deploy می‌شوند.

#### معایب Monolith
❌ مقیاس‌پذیری سخت

برای مقیاس‌کردن یک بخش، کل سیستم باید scale شود.


❌ توسعه کند در پروژه‌های بزرگ

تیم‌های بزرگ همزمان روی یک کد بیس کار می‌کنند → Merge conflicts زیاد



❌ تأثیر خطا

یک مشکل کوچک می‌تواند کل سیستم را متوقف کند.




❌ تکنولوژی محدود

کل برنامه معمولاً با یک زبان/فریم‌ورک نوشته می‌شود.


#### خلاصه:
اول اینکه Monolith برای پروژه‌های کوچک یا متوسط عالی است و راه‌اندازی سریع دارد.
و Microservice برای پروژه‌های بزرگ و تیم‌های متعدد مناسب است که نیاز به مقیاس‌پذیری و انعطاف دارند.