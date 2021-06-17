provider "aws" {
  access_key = "AKIAZHGWHQZD3FYYTAGH"

  secret_key = "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"					
    region = "${var.aws_region}"
}


resource "random_id" "tf_bucket_id" {
  byte_length = 2
    }

resource "aws_s3_bucket" "tf_code" {
 bucket="${var.project_name}-${random_id.tf_bucket_id.dec}"
  acl="private"
  force_destroy = true
 
    tags = {
         Name = "tf_bucket"
          }
    
  }  
