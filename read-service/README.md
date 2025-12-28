# read-service

#### Orchestrator + Feign Clients

---
## read-service

### Overview
read-service acts as an orchestrator in this Spring Cloud microservices setup. Its responsibility is to aggregate data from multiple downstream services and expose a single, composed API to consumers.

This service demonstrates:
- API Composition pattern

- Orchestration at the application layer

- Declarative inter-service communication using Feign

- Service discovery via Eureka

### Role in the Architecture
In this system:
- book-service provides book data (multiple instances / replicas)

- car-service provides car data

- read-service coordinates calls to these services and returns a combined response

Instead of pushing aggregation logic to the client, read-service centralizes it, keeping clients simple and decoupled.

### Key Responsibilities
- Discover downstream services using Eureka

- Call services via Feign clients (no hardcoded URLs)

- Aggregate responses into a single payload

- Act as an orchestration layer (not a data owner)

### API Endpoints
GET /execute
Aggregates responses from:
- book-service → /books

- car-service → /cars

Returns a combined list of results.

### Technologies Used
- Spring Boot

- Spring Cloud Eureka Client

- Spring Cloud OpenFeign

- REST (HTTP/JSON)

### Architectural Pattern
This service is an example of:
- <b>API Composition Pattern</b>

- <b>Orchestrator-based communication (as opposed to choreography)</b>

The orchestration logic is explicit, readable, and easy to evolve.




### Notes
- read-service does not persist data

- It depends on service discovery rather than static configuration

- Horizontal scaling is supported naturally by running multiple instances of downstream services

