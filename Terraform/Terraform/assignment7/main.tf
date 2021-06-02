provider "aws" {
  access_key = "AKIAZHGWHQZD3FYYTAGH"

  secret_key = "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"					
    region = "${var.aws_region}"
}


resource "random_id" "tf_bucket_id" {
    count = var.number_of_instances
  byte_length = 2
    }

resource "aws_s3_bucket" "tf_code" {
 count = var.number_of_instances
 bucket="${var.project_name}-${random_id.tf_bucket_id[count.index].dec}"
 acl="private"
 force_destroy = true
 
    tags = {
         Name = "tf_bucket_${count.index + 1}"
          }
    
  }  
