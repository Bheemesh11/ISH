# Microservices Architecture Project

## Overview

This repository contains a microservices-based system incorporating multiple services to address different business functionalities. The architecture is designed with key components including Eureka for service discovery, Config Server for centralized configuration, and Admin Server for management and monitoring. 

## Services

### Core Services

1. **EurekaServer**
   - Service Registry and Discovery
   - URL: `http://localhost:8761`

2. **ConfigServer**
   - Centralized Configuration Management
   - URL: `http://localhost:8888`

3. **AdminServer**
   - Administrative Management and Monitoring
   - URL: `http://localhost:9001`

### Microservices

4. **AR-API**
   - Handles AR-related functionalities.

5. **AdminServer**
   - Manages administrative tasks.

6. **CITIZEN-API**
   - Provides APIs related to citizen information.

7. **CO-API**
   - Manages Correspondece -related functionalities.

8. **DC-API**
   - Handles Data Collection-related functionalities.

9. **ED-API**
   - Provides APIs related to education.

10. **PLANS-API**
    - Manages plan-related information.

11. **REPORTS-API**
    - Generates and handles reports.

12. **SSN-SERVICE-PROVIDER**
    - An External api to verify the Social Security Number of the citizen.

## Project Structure


## Key Features

- **Service Discovery**: Utilizes Eureka Server for dynamic service discovery and registration.
- **Centralized Configuration**: Config Server manages configurations across all microservices.
- **Administrative Management**: Admin Server provides service health checks and monitoring tools.
- **Modular APIs**: Microservices offer specific APIs for various functionalities, ensuring a modular and scalable architecture.

## Comparison with US Health Insurance Systems

This project's architecture can be compared to health insurance systems in the USA in the following ways:

1. **Modularity**: Similar to health insurance systems, this project is divided into distinct microservices for specific functions such as policy management, claims processing, and customer support.
2. **Service Discovery**: Like health insurance systems that use service discovery for scalability, this project uses Eureka Server.
3. **Centralized Configuration**: The Config Server in this project is akin to how health insurance systems manage configurations centrally.
4. **Administrative Tools**: The Admin Server provides monitoring and management features similar to those in health insurance systems.
5. **API Design**: Each microservice offers APIs analogous to those in health insurance systems, covering functionalities such as customer information, billing, and reporting.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven or Gradle
- Docker (optional for containerization)

### Installation

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd <repository-directory>
