<?php

$mathservice = new SoapClient("http://localhost:8080/Math_ws/services/Math?wsdl");
$result = $mathservice->add(array("i" => 10, "j" => 5));
echo $result->addReturn;
