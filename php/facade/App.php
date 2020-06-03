<?php

$customer = new Customer("1", "usup", "echo.@mail.com");
$facade = new CustomerFacade();
$json = $facade->toJson($customer);

