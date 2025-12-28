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


