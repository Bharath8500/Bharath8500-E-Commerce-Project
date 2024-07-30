<!DOCTYPE html>
<html lang="en">
  <head>
      <style>
      img {
        height: 300px;
        width: 600px;
      }
    </style>
  </head>
  <body>
    <h1>E-Commerce (Microservices Architecture Project )</h1>
    <h2>Overview:</h2>
    <p>
      This project demonstrates a microservices-based architecture deployed
      using Docker and Kubernetes. The architecture comprises several services
      that interact synchronously and asynchronously to provide a seamless
      experience for users. Key technologies used in this project include Spring
      Boot, Kafka, Eureka, Config Server, and various monitoring and logging
      tools.
    </p>
    <h3>Diagram:</h3>
    <img src="./Architecture.png" alt="" />

    <h2>1. API Gateway</h2>
    <p>
      Acts as the entry point for all client requests, routing them to the
      appropriate microservices and handling concerns like authentication and
      rate limiting.
    </p>
    <h2>2. Discovery Server</h2>
    <p>
      Implemented using Eureka, it provides service registration and discovery,
      allowing microservices to find each other dynamically.
    </p>
    <h2>3. Inventory Service</h2>
    <p>
      Manages product inventories, updating stock levels based on orders
      processed by the Order Service. Communicates synchronously with the Order
      Service.
    </p>
    <h2>4. Notification Service</h2>
    <p>
      Handles sending notifications to users. Processes messages from the Order
      Service via Kafka to send email or SMS notifications about order status.
    </p>
    <h2>5. Order Service</h2>
    <p>
      Manages customer orders, interacting with the Product and Inventory
      Services for order details and stock updates. Uses Kafka to send
      notifications to the Notification Service.
    </p>
    <h2>6. Product Service</h2>
    <p>
      Manages product information such as descriptions, prices, and
      availability. Communicates with the Order Service to provide necessary
      product details.
    </p>
    <h4>Root-Level Files and Directories</h4>
    <ul>
      <li>.gitignore: Specifies files and directories to be ignored by Git.</li>
      <li>
        docker-compose.yml: Defines services, networks, and volumes for running
        the application in Docker containers.
      </li>
      <li>
        pom.xml: Maven Project Object Model file defining project dependencies
        and build configurations.
      </li>
      <li>
        README.md: Contains project description, setup instructions, and usage
        guidelines.
      </li>
    </ul>
    <p>
      Each microservice is independently deployable and scalable, communicating
      via REST APIs or Kafka messaging, ensuring a flexible and maintainable
      architecture.
    </p>
    <img src="./Overview.png" alt="" />
  </body>
</html>
