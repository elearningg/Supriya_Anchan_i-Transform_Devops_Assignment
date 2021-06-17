output "ip_address" {
  value       = module.mymodule.ip_address
  description = "The IP for the container."
}
 
output "container_name" {
  value       = module.mymodule.container_name
  description = "The name of the container."
} 